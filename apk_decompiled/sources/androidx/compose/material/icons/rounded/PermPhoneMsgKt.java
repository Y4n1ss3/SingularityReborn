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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PermPhoneMsgKt {
    private static ImageVector _permPhoneMsg;

    public static final ImageVector getPermPhoneMsg(Icons.Rounded rounded) {
        ImageVector imageVector = _permPhoneMsg;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PermPhoneMsg", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(20.0f, 3.0f, -7.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        r6.h(a, 9.0f, 3.0f, -3.0f, 5.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        a.lineTo(21.0f, 4.0f);
        a.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        k4.x(a, 19.23f, 15.26f, -2.54f, -0.29f);
        a.curveToRelative(-0.61f, -0.07f, -1.21f, 0.14f, -1.64f, 0.57f);
        a.lineToRelative(-1.84f, 1.84f);
        a.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        a.lineToRelative(1.85f, -1.85f);
        a.curveToRelative(0.43f, -0.43f, 0.64f, -1.03f, 0.57f, -1.64f);
        a.lineToRelative(-0.29f, -2.52f);
        a.curveToRelative(-0.12f, -1.01f, -0.97f, -1.77f, -1.99f, -1.77f);
        a.lineTo(5.03f, 3.01f);
        a.curveToRelative(-1.13f, 0.0f, -2.07f, 0.94f, -2.0f, 2.07f);
        a.curveToRelative(0.53f, 8.54f, 7.36f, 15.36f, 15.89f, 15.89f);
        a.curveToRelative(1.13f, 0.07f, 2.07f, -0.87f, 2.07f, -2.0f);
        a.verticalLineToRelative(-1.73f);
        a.curveToRelative(0.01f, -1.01f, -0.75f, -1.86f, -1.76f, -1.98f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _permPhoneMsg = build;
        build.getClass();
        return build;
    }
}
