package org.mule.transport.http.builder;

import org.mule.config.spring.parsers.generic.AutoIdUtils;
import org.mule.config.spring.parsers.generic.ChildDefinitionParser;

import org.w3c.dom.Element;

public class HttpCookiesDefinitionParser extends ChildDefinitionParser
{
    public HttpCookiesDefinitionParser(String setterMethod, Class<?> clazz)
    {
        super(setterMethod, clazz);
    }

    // I don't care about the name since they are going to be used in a List
    @Override
    public String getBeanName(Element e)
    {
        String parentId = getParentBeanName(e);
        if (!parentId.startsWith("."))
        {
            parentId = "." + parentId;
        }
        return AutoIdUtils.uniqueValue(parentId + ":" + e.getLocalName());
    }


}
