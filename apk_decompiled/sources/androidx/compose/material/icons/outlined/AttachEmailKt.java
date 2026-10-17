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
import defpackage.af0;
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AttachEmailKt {
    private static ImageVector _attachEmail;

    public static final ImageVector getAttachEmail(Icons.Outlined outlined) {
        ImageVector imageVector = _attachEmail;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AttachEmail", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(3.0f, 6.0f, 8.0f, 5.0f);
        r6.A(e, 8.0f, -5.0f, 3.0f, 2.0f);
        e.verticalLineTo(4.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.horizontalLineTo(3.0f);
        e.curveTo(1.9f, 2.0f, 1.01f, 2.9f, 1.01f, 4.0f);
        e.lineTo(1.0f, 16.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gy.t(e, 10.0f, -2.0f, 3.0f, 6.0f);
        e.moveTo(19.0f, 4.0f);
        e.lineToRelative(-8.0f, 5.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.v(e, 3.0f, 4.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(21.0f, 14.0f, 4.0f);
        h.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        h.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        h.verticalLineToRelative(-4.5f);
        h.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        h.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        kf0.r(h, 18.0f, 2.0f, -4.5f);
        h.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        h.reflectiveCurveTo(15.0f, 12.12f, 15.0f, 13.5f);
        h.verticalLineTo(18.0f);
        h.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        h.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.e(h, -4.0f, 21.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _attachEmail = build;
        build.getClass();
        return build;
    }
}
