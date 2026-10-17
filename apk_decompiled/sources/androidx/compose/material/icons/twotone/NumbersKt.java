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
import defpackage.gy;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NumbersKt {
    private static ImageVector _numbers;

    public static final ImageVector getNumbers(Icons.TwoTone twoTone) {
        ImageVector imageVector = _numbers;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Numbers", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(20.5f, 10.0f, 21.0f, 8.0f, -4.0f);
        k.lineToRelative(1.0f, -4.0f);
        kf0.B(k, -2.0f, -1.0f, 4.0f, -4.0f);
        k.lineToRelative(1.0f, -4.0f);
        kf0.A(k, -2.0f, 9.0f, 8.0f, 5.0f);
        k.lineToRelative(-0.5f, 2.0f);
        kf0.B(k, 4.0f, -1.0f, 4.0f, -4.0f);
        k.lineTo(3.0f, 16.0f);
        kf0.B(k, 4.0f, -1.0f, 4.0f, 2.0f);
        k.lineToRelative(1.0f, -4.0f);
        kf0.B(k, 4.0f, -1.0f, 4.0f, 2.0f);
        k.lineToRelative(1.0f, -4.0f);
        kf0.B(k, 4.0f, 0.5f, -2.0f, -4.0f);
        gy.w(k, 1.0f, -4.0f, 20.5f);
        k.moveTo(13.5f, 14.0f);
        kf0.B(k, -4.0f, 1.0f, -4.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(k, 13.5f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _numbers = build;
        build.getClass();
        return build;
    }
}
