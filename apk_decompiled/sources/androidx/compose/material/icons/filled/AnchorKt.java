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
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnchorKt {
    private static ImageVector _anchor;

    public static final ImageVector getAnchor(Icons.Filled filled) {
        ImageVector imageVector = _anchor;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Anchor", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.0f, 15.0f, 1.55f, 1.55f);
        e.curveToRelative(-0.96f, 1.69f, -3.33f, 3.04f, -5.55f, 3.37f);
        gy.z(e, 11.0f, 3.0f, 9.0f, -3.0f);
        e.verticalLineTo(7.82f);
        e.curveTo(14.16f, 7.4f, 15.0f, 6.3f, 15.0f, 5.0f);
        e.curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f);
        e.reflectiveCurveTo(9.0f, 3.35f, 9.0f, 5.0f);
        e.curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        bv.A(e, 9.0f, 8.0f, 2.0f, 3.0f);
        e.verticalLineToRelative(8.92f);
        e.curveToRelative(-2.22f, -0.33f, -4.59f, -1.68f, -5.55f, -3.37f);
        e.lineTo(7.0f, 15.0f);
        e.lineToRelative(-4.0f, -3.0f);
        e.verticalLineToRelative(3.0f);
        e.curveToRelative(0.0f, 3.88f, 4.92f, 7.0f, 9.0f, 7.0f);
        e.reflectiveCurveToRelative(9.0f, -3.12f, 9.0f, -7.0f);
        kf0.t(e, -3.0f, 17.0f, 15.0f);
        e.moveTo(12.0f, 4.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        e.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        e.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(e, 11.45f, 4.0f, 12.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _anchor = build;
        build.getClass();
        return build;
    }
}
