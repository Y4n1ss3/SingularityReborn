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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwitchCameraKt {
    private static ImageVector _switchCamera;

    public static final ImageVector getSwitchCamera(Icons.TwoTone twoTone) {
        ImageVector imageVector = _switchCamera;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SwitchCamera", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder l = uf.l(14.12f, 4.0f, 9.88f, 8.05f, 6.0f);
        af0.g(l, 4.0f, 12.0f, 16.0f, 6.0f);
        uo.w(l, -4.05f, -1.83f, -2.0f);
        kp0.C(l, 15.0f, 15.5f, 13.0f, 9.0f);
        l.verticalLineToRelative(2.5f);
        l.lineTo(5.5f, 12.0f);
        fc.t(l, 9.0f, 8.5f, 11.0f, 6.0f);
        l.verticalLineTo(8.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(l, 3.5f, 3.5f, -3.5f, 3.5f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(20.0f, 4.0f, -3.17f, 15.0f, 2.0f);
        p.lineTo(9.0f, 2.0f);
        p.lineTo(7.17f, 4.0f);
        p.lineTo(4.0f, 4.0f);
        p.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        p.verticalLineToRelative(12.0f);
        p.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        p.horizontalLineToRelative(16.0f);
        p.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        p.lineTo(22.0f, 6.0f);
        p.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(p, 20.0f, 18.0f, 4.0f, 18.0f);
        p.lineTo(4.0f, 6.0f);
        kf0.B(p, 4.05f, 1.83f, -2.0f, 4.24f);
        p.lineToRelative(1.83f, 2.0f);
        bv.r(p, 20.0f, 6.0f, 12.0f);
        p.moveTo(15.0f, 11.0f);
        p.lineTo(9.0f, 11.0f);
        p.lineTo(9.0f, 8.5f);
        p.lineTo(5.5f, 12.0f);
        p.lineTo(9.0f, 15.5f);
        fc.w(p, 9.0f, 13.0f, 6.0f, 2.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(p, 3.5f, -3.5f, 15.0f, 8.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _switchCamera = build;
        build.getClass();
        return build;
    }
}
