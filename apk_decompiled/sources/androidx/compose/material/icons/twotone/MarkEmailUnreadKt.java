package androidx.compose.material.icons.twotone;

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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MarkEmailUnreadKt {
    private static ImageVector _markEmailUnread;

    public static final ImageVector getMarkEmailUnread(Icons.TwoTone twoTone) {
        ImageVector imageVector = _markEmailUnread;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MarkEmailUnread", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(4.0f, 6.0f, 10.1f);
        a.curveToRelative(0.22f, 1.07f, 0.79f, 2.0f, 1.57f, 2.71f);
        r6.C(a, 12.0f, 11.0f, 4.0f, 6.0f);
        bv.y(a, 4.0f, 8.0f, 10.0f, 16.0f);
        a.verticalLineTo(9.9f);
        a.curveToRelative(-0.32f, 0.07f, -0.66f, 0.1f, -1.0f, 0.1f);
        a.curveToRelative(-0.6f, 0.0f, -1.16f, -0.12f, -1.7f, -0.32f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(a, 12.0f, 13.0f, 4.0f, 8.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.0f, 9.9f);
        b.curveToRelative(0.74f, -0.15f, 1.42f, -0.48f, 2.0f, -0.92f);
        b.verticalLineTo(18.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.horizontalLineTo(4.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.verticalLineTo(6.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.horizontalLineToRelative(10.1f);
        b.curveTo(14.04f, 4.32f, 14.0f, 4.66f, 14.0f, 5.0f);
        b.reflectiveCurveToRelative(0.04f, 0.68f, 0.1f, 1.0f);
        b.horizontalLineTo(4.0f);
        b.lineToRelative(8.0f, 5.0f);
        b.lineToRelative(3.67f, -2.29f);
        b.curveToRelative(0.47f, 0.43f, 1.02f, 0.76f, 1.63f, 0.98f);
        b.lineTo(12.0f, 13.0f);
        af0.m(b, 4.0f, 8.0f, 10.0f, 16.0f);
        bv.t(b, 9.9f, 16.0f, 5.0f);
        b.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        b.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        b.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 16.0f, 3.34f, 16.0f, 5.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _markEmailUnread = build;
        build.getClass();
        return build;
    }
}
