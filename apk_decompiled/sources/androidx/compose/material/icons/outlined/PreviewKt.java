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
import defpackage.c21;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PreviewKt {
    private static ImageVector _preview;

    public static final ImageVector getPreview(Icons.Outlined outlined) {
        ImageVector imageVector = _preview;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Preview", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(19.0f, 3.0f, 5.0f);
        d.curveTo(3.89f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(21.0f, 3.9f, 20.11f, 3.0f, 19.0f, 3.0f);
        c21.d(d, 19.0f, 19.0f, 5.0f, 7.0f);
        uo.r(d, 14.0f, 19.0f, 12.0f, 10.5f);
        d.curveToRelative(1.84f, 0.0f, 3.48f, 0.96f, 4.34f, 2.5f);
        d.curveToRelative(-0.86f, 1.54f, -2.5f, 2.5f, -4.34f, 2.5f);
        d.reflectiveCurveTo(8.52f, 14.54f, 7.66f, 13.0f);
        d.curveTo(8.52f, 11.46f, 10.16f, 10.5f, 12.0f, 10.5f);
        d.moveTo(12.0f, 9.0f);
        d.curveToRelative(-2.73f, 0.0f, -5.06f, 1.66f, -6.0f, 4.0f);
        d.curveToRelative(0.94f, 2.34f, 3.27f, 4.0f, 6.0f, 4.0f);
        d.reflectiveCurveToRelative(5.06f, -1.66f, 6.0f, -4.0f);
        d.curveTo(17.06f, 10.66f, 14.73f, 9.0f, 12.0f, 9.0f);
        uo.l(d, 12.0f, 9.0f, 12.0f, 14.5f);
        d.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        d.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        d.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(d, 12.83f, 14.5f, 12.0f, 14.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _preview = build;
        build.getClass();
        return build;
    }
}
