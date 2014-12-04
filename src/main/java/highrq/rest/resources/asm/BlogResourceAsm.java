package highrq.rest.resources.asm;

import highrq.rest.mvc.AccountController;
import highrq.rest.resources.BlogResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import highrq.core.models.entities.Blog;
import highrq.rest.mvc.BlogController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

public class BlogResourceAsm extends ResourceAssemblerSupport<Blog, BlogResource> {
    public BlogResourceAsm() {
        super(BlogController.class, BlogResource.class);
    }

    @Override
    public BlogResource toResource(Blog blog) {
        BlogResource resource = new BlogResource();
        resource.setTitle(blog.getTitle());
        resource.add(linkTo(BlogController.class).slash(blog.getId()).withSelfRel());
        resource.add(linkTo(BlogController.class).slash(blog.getId()).slash("blog-entries").withRel("entries"));
        if (blog.getAccount() != null) {
            resource.add(linkTo(AccountController.class).slash(blog.getAccount().getId()).withRel("owner"));
        }
        return resource;
    }
}
