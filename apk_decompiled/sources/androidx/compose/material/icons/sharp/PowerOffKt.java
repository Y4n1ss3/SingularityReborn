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
import defpackage.af0;
import defpackage.bv;
import defpackage.fc;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PowerOffKt {
    private static ImageVector _powerOff;

    public static final ImageVector getPowerOff(Icons.Sharp sharp) {
        ImageVector imageVector = _powerOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PowerOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(18.0f, 14.49f, 18.0f, 9.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        fc.w(i, 16.0f, 3.0f, -2.0f, 4.0f);
        i.horizontalLineToRelative(-3.88f);
        fc.C(i, 7.69f, 7.69f, 0.19f, -0.2f);
        i.moveTo(10.0f, 3.0f);
        i.lineTo(8.0f, 3.0f);
        uo.t(i, 1.88f, 2.0f, 2.0f);
        i.moveTo(4.12f, 3.84f);
        i.lineTo(2.71f, 5.25f);
        i.lineToRelative(3.34f, 3.34f);
        i.curveToRelative(-0.03f, 0.13f, -0.05f, 0.27f, -0.05f, 0.4f);
        bv.q(i, 5.51f, 9.5f, 18.0f, 3.0f);
        bv.p(i, 5.0f, -3.0f, 0.48f, -0.48f);
        i.lineToRelative(4.47f, 4.47f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 1.41f, -1.41f, 4.12f, 3.84f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _powerOff = build;
        build.getClass();
        return build;
    }
}
