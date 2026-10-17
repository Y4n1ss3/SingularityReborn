package androidx.compose.material.icons.filled;

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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PowerOffKt {
    private static ImageVector _powerOff;

    public static final ImageVector getPowerOff(Icons.Filled filled) {
        ImageVector imageVector = _powerOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PowerOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(18.0f, 14.49f, 18.0f, 9.0f);
        i.curveToRelative(0.0f, -1.0f, -1.01f, -2.01f, -2.0f, -2.0f);
        fc.w(i, 16.0f, 3.0f, -2.0f, 4.0f);
        i.horizontalLineToRelative(-4.0f);
        i.lineTo(10.0f, 3.0f);
        i.lineTo(8.0f, 3.0f);
        i.verticalLineToRelative(2.48f);
        fc.C(i, 9.51f, 9.5f, 0.49f, -0.49f);
        i.moveTo(16.24f, 16.26f);
        i.lineTo(7.2f, 7.2f);
        i.lineToRelative(-0.01f, 0.01f);
        i.lineTo(3.98f, 4.0f);
        i.lineTo(2.71f, 5.25f);
        i.lineToRelative(3.36f, 3.36f);
        i.curveTo(6.04f, 8.74f, 6.0f, 8.87f, 6.0f, 9.0f);
        bv.q(i, 5.48f, 9.5f, 18.0f, 3.0f);
        bv.p(i, 5.0f, -3.0f, 0.48f, -0.48f);
        i.lineTo(19.45f, 22.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(i, 1.26f, -1.28f, -4.47f, -4.46f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _powerOff = build;
        build.getClass();
        return build;
    }
}
