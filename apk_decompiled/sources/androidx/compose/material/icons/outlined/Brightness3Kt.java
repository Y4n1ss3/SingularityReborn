package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Brightness3Kt {
    private static ImageVector _brightness3;

    public static final ImageVector getBrightness3(Icons.Outlined outlined) {
        ImageVector imageVector = _brightness3;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Brightness3", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.7f, 4.91f);
        b.curveTo(15.25f, 6.24f, 17.0f, 8.92f, 17.0f, 12.0f);
        b.reflectiveCurveToRelative(-1.75f, 5.76f, -4.3f, 7.09f);
        b.curveToRelative(1.46f, -2.0f, 2.3f, -4.46f, 2.3f, -7.09f);
        b.reflectiveCurveToRelative(-0.84f, -5.09f, -2.3f, -7.09f);
        b.moveTo(9.0f, 2.0f);
        b.curveToRelative(-1.05f, 0.0f, -2.05f, 0.16f, -3.0f, 0.46f);
        b.curveToRelative(4.06f, 1.27f, 7.0f, 5.06f, 7.0f, 9.54f);
        b.reflectiveCurveToRelative(-2.94f, 8.27f, -7.0f, 9.54f);
        b.curveToRelative(0.95f, 0.3f, 1.95f, 0.46f, 3.0f, 0.46f);
        b.curveToRelative(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 14.52f, 2.0f, 9.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightness3 = build;
        build.getClass();
        return build;
    }
}
