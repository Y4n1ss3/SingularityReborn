package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.compat.AndroidVectorParser;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ImageVectorCache;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorResources_androidKt {
    public static final ImageVectorCache.ImageVectorEntry loadVectorResourceInner(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        AndroidVectorParser androidVectorParser = new AndroidVectorParser(xmlResourceParser, 0, 2, null);
        ImageVector.Builder createVectorImageBuilder = XmlVectorParser_androidKt.createVectorImageBuilder(androidVectorParser, resources, theme, asAttributeSet);
        int i2 = 0;
        while (!XmlVectorParser_androidKt.isAtEnd(xmlResourceParser)) {
            i2 = XmlVectorParser_androidKt.parseCurrentVectorNode(androidVectorParser, resources, asAttributeSet, theme, createVectorImageBuilder, i2);
            xmlResourceParser.next();
        }
        return new ImageVectorCache.ImageVectorEntry(createVectorImageBuilder.build(), androidVectorParser.getConfig() | i);
    }

    public static /* synthetic */ ImageVectorCache.ImageVectorEntry loadVectorResourceInner$default(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            theme = null;
        }
        return loadVectorResourceInner(theme, resources, xmlResourceParser, i);
    }

    public static final ImageVector vectorResource(ImageVector.Companion companion, int i, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(44534090, i2, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:48)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Resources resources = (Resources) composer.consume(AndroidCompositionLocals_androidKt.getLocalResources());
        Resources.Theme theme = context.getTheme();
        boolean changed = ((((i2 & 112) ^ 48) > 32 && composer.changed(i)) || (i2 & 48) == 32) | composer.changed(resources) | composer.changed(theme) | composer.changed(resources.getConfiguration());
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = vectorResource(companion, theme, resources, i);
            composer.updateRememberedValue(rememberedValue);
        }
        ImageVector imageVector = (ImageVector) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imageVector;
    }

    public static /* synthetic */ ImageVector vectorResource$default(ImageVector.Companion companion, Resources.Theme theme, Resources resources, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            theme = null;
        }
        return vectorResource(companion, theme, resources, i);
    }

    public static final ImageVector vectorResource(ImageVector.Companion companion, Resources.Theme theme, Resources resources, int i) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        XmlResourceParser xml = resources.getXml(i);
        XmlVectorParser_androidKt.seekToStartTag(xml);
        return loadVectorResourceInner(theme, resources, xml, typedValue.changingConfigurations).getImageVector();
    }
}
