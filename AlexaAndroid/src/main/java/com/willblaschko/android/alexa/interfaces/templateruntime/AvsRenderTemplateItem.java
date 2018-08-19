package com.willblaschko.android.alexa.interfaces.templateruntime;

import com.willblaschko.android.alexa.data.Directive;
import com.willblaschko.android.alexa.interfaces.AvsItem;

public class AvsRenderTemplateItem extends AvsItem {
    private String type;
    private Directive.Title title;
    private Directive.ImageStructure skillIcon;
    private String textField;
    private Directive.ImageStructure image;

    public static final String BODY_TEMPLATE_1 = "BodyTemplate1";
    public static final String BODY_TEMPLATE_2 = "BodyTemplate2";

    public AvsRenderTemplateItem(String token, String type, Directive.Title title, Directive.ImageStructure skillIcon, String textField, Directive.ImageStructure image) {
        super(token);
        this.type = type;
        this.title = title;
        this.skillIcon = skillIcon;
        this.textField = textField;
        this.image = image;
    }

    public Directive.Title getTitle() {
        return title;
    }

    public Directive.ImageStructure getSkillIcon() {
        return skillIcon;
    }

    public String getTextField() {
        return textField;
    }

    public Directive.ImageStructure getImage() {
        return image;
    }

    public boolean isBodyTemplate1() {
        return type.equals(BODY_TEMPLATE_1);
    }

    public boolean isBodyTemplate2() {
        return type.equals(BODY_TEMPLATE_2);
    }
}
