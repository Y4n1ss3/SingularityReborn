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
import defpackage.bv;
import defpackage.fc;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlashAutoKt {
    private static ImageVector _flashAuto;

    public static final ImageVector getFlashAuto(Icons.TwoTone twoTone) {
        ImageVector imageVector = _flashAuto;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FlashAuto", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(3.0f, 2.0f, 12.0f, 3.0f, 9.0f);
        s.lineToRelative(7.0f, -12.0f);
        bv.o(s, 9.0f, 11.0f, 4.0f, -9.0f);
        s.moveTo(17.0f, 2.0f);
        s.lineToRelative(-3.2f, 9.0f);
        kf0.B(s, 1.9f, 0.7f, -2.0f, 3.2f);
        s.lineToRelative(0.7f, 2.0f);
        uf.C(s, 1.9f, 19.0f, 2.0f, -2.0f);
        s.moveTo(16.85f, 7.65f);
        s.lineTo(18.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.g(s, 1.15f, 3.65f, -2.3f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flashAuto = build;
        build.getClass();
        return build;
    }
}
