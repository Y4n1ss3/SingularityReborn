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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatColorTextKt {
    private static ImageVector _formatColorText;

    public static final ImageVector getFormatColorText(Icons.Rounded rounded) {
        ImageVector imageVector = _formatColorText;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FormatColorText", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 20.0f, 4.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        d.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(16.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(d, 21.1f, 20.0f, 20.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(7.11f, 17.0f, 7.11f, 17.0f);
        i.curveToRelative(0.48f, 0.0f, 0.91f, -0.3f, 1.06f, -0.75f);
        i.lineToRelative(1.01f, -2.83f);
        i.horizontalLineToRelative(5.65f);
        i.lineToRelative(0.99f, 2.82f);
        i.curveTo(15.98f, 16.7f, 16.41f, 17.0f, 16.89f, 17.0f);
        i.curveToRelative(0.79f, 0.0f, 1.33f, -0.79f, 1.05f, -1.52f);
        i.lineTo(13.69f, 4.17f);
        i.curveTo(13.43f, 3.47f, 12.75f, 3.0f, 12.0f, 3.0f);
        i.reflectiveCurveToRelative(-1.43f, 0.47f, -1.69f, 1.17f);
        i.lineTo(6.06f, 15.48f);
        i.curveTo(5.78f, 16.21f, 6.33f, 17.0f, 7.11f, 17.0f);
        af0.l(i, 11.94f, 5.6f, 0.12f);
        i.lineToRelative(2.03f, 5.79f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.m(i, 9.91f, 11.94f, 5.6f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatColorText = build;
        build.getClass();
        return build;
    }
}
