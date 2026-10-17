package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PermPhoneMsgKt {
    private static ImageVector _permPhoneMsg;

    public static final ImageVector getPermPhoneMsg(Icons.Sharp sharp) {
        ImageVector imageVector = _permPhoneMsg;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PermPhoneMsg", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(12.0f, 3.0f, 10.0f, 3.0f, -3.0f);
        gy.n(n, 6.0f, 21.0f, 3.0f);
        n.moveTo(13.21f, 17.37f);
        n.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        n.lineToRelative(2.53f, -2.53f);
        n.lineTo(8.54f, 3.0f);
        n.lineTo(3.03f, 3.0f);
        n.curveTo(2.45f, 13.18f, 10.82f, 21.55f, 21.0f, 20.97f);
        n.verticalLineToRelative(-5.51f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(n, -5.27f, -0.61f, -2.52f, 2.52f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _permPhoneMsg = build;
        build.getClass();
        return build;
    }
}
