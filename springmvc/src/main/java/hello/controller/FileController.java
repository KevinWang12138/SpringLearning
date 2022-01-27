package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class FileController {
    @RequestMapping("/uploadFile")
    public String uploadFile(HttpServletRequest request,@RequestParam("file") MultipartFile multipartFile){
//        //转换对应的request对象
//        MultipartHttpServletRequest multipartHttpServletRequest=(MultipartHttpServletRequest) request;
//        MultipartFile multipartFile=multipartHttpServletRequest.getFile("file");//参数值对应的是表单元素的name属性值


        //对文件进行处理
        //判断文件是否存在
        if(!multipartFile.isEmpty()){
            String path=request.getServletContext().getRealPath("/");
            File uploadFile=new File(path+"/upload");
            if(!uploadFile.exists()){
                uploadFile.mkdir();
            }
            //得到上传的文件的文件名
            String name=multipartFile.getOriginalFilename();
            //文件后缀
            String suff=name.substring(name.lastIndexOf('.'));
            //通过系统时间戳设置不重复的文件名
            String fileName=System.currentTimeMillis()+suff;
            //上传文件
            try {
                multipartFile.transferTo(new File(uploadFile,fileName));
                request.setAttribute("msg","文件上传成功");
                System.out.println(fileName);
            } catch (IOException e) {
                request.setAttribute("msg","文件上传失败");
            }

        }else {
            request.setAttribute("msg","文件不存在");
        }

        return "result";
    }
}
