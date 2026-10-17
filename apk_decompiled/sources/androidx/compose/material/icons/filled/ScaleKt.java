package androidx.compose.material.icons.filled;

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
import defpackage.j50;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScaleKt {
    private static ImageVector _scale;

    public static final ImageVector getScale(Icons.Filled filled) {
        ImageVector imageVector = _scale;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Scale", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(14.0f, 11.0f, 8.0f);
        d.curveToRelative(4.56f, -0.58f, 8.0f, -3.1f, 8.0f, -6.0f);
        d.horizontalLineTo(2.0f);
        d.curveToRelative(0.0f, 2.9f, 3.44f, 5.42f, 8.0f, 6.0f);
        d.lineToRelative(0.0f, 3.0f);
        d.curveToRelative(-3.68f, 0.73f, -8.0f, 3.61f, -8.0f, 11.0f);
        k4.k(d, 6.0f, -2.0f, 4.13f);
        d.curveToRelative(0.93f, -6.83f, 6.65f, -7.2f, 7.87f, -7.2f);
        d.reflectiveCurveToRelative(6.94f, 0.37f, 7.87f, 7.2f);
        af0.u(d, 16.0f, 2.0f, 6.0f);
        d.curveTo(22.0f, 14.61f, 17.68f, 11.73f, 14.0f, 11.0f);
        d.close();
        d.moveTo(12.0f, 22.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        d.curveToRelative(0.0f, -0.55f, 0.22f, -1.05f, 0.59f, -1.41f);
        d.curveTo(11.39f, 17.79f, 16.0f, 16.0f, 16.0f, 16.0f);
        d.reflectiveCurveToRelative(-1.79f, 4.61f, -2.59f, 5.41f);
        d.curveTo(13.05f, 21.78f, 12.55f, 22.0f, 12.0f, 22.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _scale = build;
        build.getClass();
        return build;
    }
}
