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
import defpackage.fc;
import defpackage.gy;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PowerOffKt {
    private static ImageVector _powerOff;

    public static final ImageVector getPowerOff(Icons.Outlined outlined) {
        ImageVector imageVector = _powerOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PowerOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(10.0f, 3.0f, 8.0f, 3.0f, 1.88f);
        fc.B(s, 2.0f, 2.0f, 16.0f, 9.0f);
        s.verticalLineToRelative(3.88f);
        s.lineToRelative(1.8f, 1.8f);
        s.lineToRelative(0.2f, -0.2f);
        s.lineTo(18.0f, 9.0f);
        s.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        fc.w(s, 16.0f, 3.0f, -2.0f, 4.0f);
        s.horizontalLineToRelative(-3.88f);
        gy.B(s, 2.0f, 2.0f, 16.0f, 9.0f);
        s.moveTo(4.12f, 3.84f);
        s.lineTo(2.71f, 5.25f);
        s.lineTo(6.0f, 8.54f);
        bv.q(s, 5.96f, 9.5f, 18.0f, 3.0f);
        bv.p(s, 5.0f, -3.0f, 0.48f, -0.48f);
        s.lineToRelative(4.47f, 4.47f);
        gy.B(s, 1.41f, -1.41f, 4.12f, 3.84f);
        s.moveTo(12.5f, 17.17f);
        fc.w(s, 12.5f, 19.0f, -1.0f, -1.83f);
        s.lineTo(8.0f, 13.65f);
        s.verticalLineToRelative(-3.11f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(s, 5.57f, 5.57f, -1.07f, 1.06f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _powerOff = build;
        build.getClass();
        return build;
    }
}
