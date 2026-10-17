package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LandscapeKt {
    private static ImageVector _landscape;

    public static final ImageVector getLandscape(Icons.Rounded rounded) {
        ImageVector imageVector = _landscape;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Landscape", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(13.2f, 7.07f, 10.25f, 11.0f);
        i.lineToRelative(2.25f, 3.0f);
        i.curveToRelative(0.33f, 0.44f, 0.24f, 1.07f, -0.2f, 1.4f);
        i.curveToRelative(-0.44f, 0.33f, -1.07f, 0.25f, -1.4f, -0.2f);
        i.curveToRelative(-1.05f, -1.4f, -2.31f, -3.07f, -3.1f, -4.14f);
        i.curveToRelative(-0.4f, -0.53f, -1.2f, -0.53f, -1.6f, 0.0f);
        i.lineToRelative(-4.0f, 5.33f);
        i.curveToRelative(-0.49f, 0.67f, -0.02f, 1.61f, 0.8f, 1.61f);
        i.horizontalLineToRelative(18.0f);
        i.curveToRelative(0.82f, 0.0f, 1.29f, -0.94f, 0.8f, -1.6f);
        i.lineToRelative(-7.0f, -9.33f);
        i.curveToRelative(-0.4f, -0.54f, -1.2f, -0.54f, -1.6f, 0.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _landscape = build;
        build.getClass();
        return build;
    }
}
