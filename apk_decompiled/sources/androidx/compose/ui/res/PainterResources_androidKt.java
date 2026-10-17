package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ImageVectorCache;
import defpackage.ds0;
import defpackage.o;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PainterResources_androidKt {
    private static final String errorMessage = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP";

    private static final ImageBitmap loadImageBitmapResource(CharSequence charSequence, Resources resources, int i) {
        try {
            return ImageResources_androidKt.imageResource(ImageBitmap.Companion, resources, i);
        } catch (Exception e) {
            throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e);
        }
    }

    private static final ImageVector loadVectorResource(Resources.Theme theme, Resources resources, int i, int i2, Composer composer, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(21855625, i3, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:87)");
        }
        ImageVectorCache imageVectorCache = (ImageVectorCache) composer.consume(AndroidCompositionLocals_androidKt.getLocalImageVectorCache());
        ImageVectorCache.Key key = new ImageVectorCache.Key(theme, i);
        ImageVectorCache.ImageVectorEntry imageVectorEntry = imageVectorCache.get(key);
        if (imageVectorEntry == null) {
            XmlResourceParser xml = resources.getXml(i);
            if (!q10.b(XmlVectorParser_androidKt.seekToStartTag(xml).getName(), "vector")) {
                o.m(errorMessage);
                return null;
            }
            imageVectorEntry = VectorResources_androidKt.loadVectorResourceInner(theme, resources, xml, i2);
            imageVectorCache.set(key, imageVectorEntry);
        }
        ImageVector imageVector = imageVectorEntry.getImageVector();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imageVector;
    }

    public static final Painter painterResource(int i, Composer composer, int i2) {
        Painter painter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(473971343, i2, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Resources resources = (Resources) composer.consume(AndroidCompositionLocals_androidKt.getLocalResources());
        TypedValue resolveResourcePath = ((ResourceIdCache) composer.consume(AndroidCompositionLocals_androidKt.getLocalResourceIdCache())).resolveResourcePath(resources, i);
        CharSequence charSequence = resolveResourcePath.string;
        boolean z = true;
        if (charSequence == null || !ds0.j0(charSequence, ".xml")) {
            composer.startReplaceGroup(-1771643000);
            Object theme = context.getTheme();
            boolean changed = composer.changed(charSequence);
            if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(i)) && (i2 & 6) != 4) {
                z = false;
            }
            boolean changed2 = composer.changed(theme) | changed | z;
            Object rememberedValue = composer.rememberedValue();
            if (changed2 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = loadImageBitmapResource(charSequence, resources, i);
                composer.updateRememberedValue(rememberedValue);
            }
            BitmapPainter bitmapPainter = new BitmapPainter((ImageBitmap) rememberedValue, 0L, 0L, 6, null);
            composer.endReplaceGroup();
            painter = bitmapPainter;
        } else {
            composer.startReplaceGroup(-1771798434);
            painter = VectorPainterKt.rememberVectorPainter(loadVectorResource(context.getTheme(), resources, i, resolveResourcePath.changingConfigurations, composer, (i2 << 6) & 896), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return painter;
    }
}
