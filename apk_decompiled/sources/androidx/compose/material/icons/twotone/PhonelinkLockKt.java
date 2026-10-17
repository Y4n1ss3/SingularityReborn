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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhonelinkLockKt {
    private static ImageVector _phonelinkLock;

    public static final ImageVector getPhonelinkLock(Icons.TwoTone twoTone) {
        ImageVector imageVector = _phonelinkLock;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PhonelinkLock", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.0f, 7.0f);
        b.curveTo(6.6f, 7.0f, 5.2f, 8.1f, 5.2f, 9.5f);
        b.lineTo(5.2f, 11.0f);
        b.curveToRelative(-0.6f, 0.0f, -1.2f, 0.6f, -1.2f, 1.2f);
        b.verticalLineToRelative(3.5f);
        b.curveToRelative(0.0f, 0.7f, 0.6f, 1.3f, 1.2f, 1.3f);
        b.horizontalLineToRelative(5.5f);
        b.curveToRelative(0.7f, 0.0f, 1.3f, -0.6f, 1.3f, -1.2f);
        b.verticalLineToRelative(-3.5f);
        b.curveToRelative(0.0f, -0.7f, -0.6f, -1.3f, -1.2f, -1.3f);
        b.lineTo(10.8f, 9.5f);
        b.curveTo(10.8f, 8.1f, 9.4f, 7.0f, 8.0f, 7.0f);
        af0.l(b, 9.5f, 11.0f, -3.0f);
        b.lineTo(6.5f, 9.5f);
        b.curveToRelative(0.0f, -0.8f, 0.7f, -1.3f, 1.5f, -1.3f);
        b.reflectiveCurveToRelative(1.5f, 0.5f, 1.5f, 1.3f);
        uo.l(b, 9.5f, 11.0f, 21.0f, 21.0f);
        b.lineTo(21.0f, 3.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.lineTo(9.0f, 1.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        uo.B(b, 3.0f, 2.0f, 9.0f, 4.0f);
        bv.C(b, 10.0f, 16.0f, 9.0f, 20.0f);
        bv.q(b, -2.0f, 7.0f, 18.0f, 3.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(10.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phonelinkLock = build;
        build.getClass();
        return build;
    }
}
