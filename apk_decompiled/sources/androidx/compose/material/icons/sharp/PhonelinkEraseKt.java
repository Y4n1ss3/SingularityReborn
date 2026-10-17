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
import defpackage.fc;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhonelinkEraseKt {
    private static ImageVector _phonelinkErase;

    public static final ImageVector getPhonelinkErase(Icons.Sharp sharp) {
        ImageVector imageVector = _phonelinkErase;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PhonelinkErase", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(13.0f, 8.2f, -1.0f, -1.0f);
        e.lineToRelative(-4.0f, 4.0f);
        e.lineToRelative(-4.0f, -4.0f);
        e.lineToRelative(-1.0f, 1.0f);
        e.lineToRelative(4.0f, 4.0f);
        e.lineToRelative(-4.0f, 4.0f);
        e.lineToRelative(1.0f, 1.0f);
        e.lineToRelative(4.0f, -4.0f);
        e.lineToRelative(4.0f, 4.0f);
        e.lineToRelative(1.0f, -1.0f);
        fc.C(e, -4.0f, -4.0f, 4.0f, -4.0f);
        k4.A(e, 21.0f, 1.0f, 7.0f, 5.0f);
        af0.q(e, 2.0f, 4.0f, 10.0f, 16.0f);
        af0.o(e, 9.0f, -2.0f, 7.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(e, 14.0f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phonelinkErase = build;
        build.getClass();
        return build;
    }
}
