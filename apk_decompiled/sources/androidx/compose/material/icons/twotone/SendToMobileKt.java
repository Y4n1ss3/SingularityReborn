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
import defpackage.c21;
import defpackage.er;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SendToMobileKt {
    private static ImageVector _sendToMobile;

    public static final ImageVector getSendToMobile(Icons.TwoTone twoTone) {
        ImageVector imageVector = _sendToMobile;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SendToMobile", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(7.0f, 3.0f, 10.0f, 1.0f, -10.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(7.0f, 20.0f, 10.0f, 1.0f, -10.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = kp0.e(22.0f, 12.0f, -4.0f, -4.0f, 3.0f);
        af0.v(e, -5.0f, 2.0f, 5.0f, 3.0f);
        uo.l(e, 22.0f, 12.0f, 17.0f, 18.0f);
        kf0.o(e, 7.0f, 6.0f, 10.0f, 1.0f);
        e.horizontalLineToRelative(2.0f);
        e.verticalLineTo(3.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.lineTo(7.0f, 1.01f);
        e.curveTo(5.9f, 1.01f, 5.0f, 1.9f, 5.0f, 3.0f);
        e.verticalLineToRelative(18.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(10.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        k4.p(e, -4.0f, -2.0f, 18.0f);
        k4.C(e, 7.0f, 3.0f, 10.0f, 1.0f);
        bv.s(e, 7.0f, 3.0f, 17.0f, 21.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c21.e(e, 7.0f, -1.0f, 10.0f, 21.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sendToMobile = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getSendToMobile$annotations(Icons.TwoTone twoTone) {
    }
}
