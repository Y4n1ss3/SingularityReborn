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
import defpackage.bv;
import defpackage.er;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SendToMobileKt {
    private static ImageVector _sendToMobile;

    public static final ImageVector getSendToMobile(Icons.Outlined outlined) {
        ImageVector imageVector = _sendToMobile;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SendToMobile", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(18.0f, 8.0f, 4.0f, 4.0f);
        e.lineToRelative(-4.0f, 4.0f);
        e.lineToRelative(-1.41f, -1.41f);
        r6.w(e, 18.17f, 13.0f, 13.0f, -2.0f);
        e.horizontalLineToRelative(5.17f);
        gy.B(e, -1.59f, -1.59f, 18.0f, 8.0f);
        e.moveTo(7.0f, 1.01f);
        e.lineTo(17.0f, 1.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        bv.B(e, 4.0f, -2.0f, 6.0f, 7.0f);
        r6.D(e, 12.0f, 10.0f, -1.0f, 2.0f);
        e.verticalLineToRelative(4.0f);
        e.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        e.horizontalLineTo(7.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        e.verticalLineTo(3.0f);
        e.curveTo(5.0f, 1.9f, 5.9f, 1.01f, 7.0f, 1.01f);
        r6.B(e, 7.0f, 21.0f, 10.0f, -1.0f);
        bv.s(e, 7.0f, 21.0f, 7.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.l(e, 10.0f, 3.0f, 7.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sendToMobile = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getSendToMobile$annotations(Icons.Outlined outlined) {
    }
}
