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
import defpackage.gy;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SmartButtonKt {
    private static ImageVector _smartButton;

    public static final ImageVector getSmartButton(Icons.Sharp sharp) {
        ImageVector imageVector = _smartButton;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SmartButton", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(22.0f, 17.0f, -3.0f, 0.0f, -2.0f);
        af0.p(i, 1.0f, 9.0f, 4.0f, 6.0f);
        gy.o(i, 6.0f, 2.0f, 2.0f, 7.0f);
        uo.r(i, 20.0f, 17.0f, 14.5f, 19.0f);
        i.lineToRelative(1.09f, -2.41f);
        i.lineTo(18.0f, 15.5f);
        i.lineToRelative(-2.41f, -1.09f);
        i.lineTo(14.5f, 12.0f);
        i.lineToRelative(-1.09f, 2.41f);
        i.lineTo(11.0f, 15.5f);
        gy.B(i, 2.41f, 1.09f, 14.5f, 19.0f);
        i.moveTo(17.0f, 14.0f);
        i.lineToRelative(0.62f, -1.38f);
        i.lineTo(19.0f, 12.0f);
        i.lineToRelative(-1.38f, -0.62f);
        i.lineTo(17.0f, 10.0f);
        i.lineToRelative(-0.62f, 1.38f);
        i.lineTo(15.0f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 1.38f, 0.62f, 17.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _smartButton = build;
        build.getClass();
        return build;
    }
}
