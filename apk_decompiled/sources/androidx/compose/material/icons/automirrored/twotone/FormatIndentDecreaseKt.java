package androidx.compose.material.icons.automirrored.twotone;

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
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatIndentDecreaseKt {
    private static ImageVector _formatIndentDecrease;

    public static final ImageVector getFormatIndentDecrease(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector imageVector = _formatIndentDecrease;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.FormatIndentDecrease", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(7.0f, 16.0f, 7.0f, 8.0f);
        fc.B(i, -4.0f, 4.0f, 11.0f, 7.0f);
        j50.o(i, 10.0f, 2.0f, 11.0f, 9.0f);
        k4.C(i, 11.0f, 11.0f, 10.0f, 2.0f);
        uo.l(i, 11.0f, 13.0f, 11.0f, 15.0f);
        j50.o(i, 10.0f, 2.0f, 11.0f, 17.0f);
        k4.C(i, 3.0f, 19.0f, 18.0f, 2.0f);
        uo.l(i, 3.0f, 21.0f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kp0.h(i, 18.0f, 2.0f, 3.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatIndentDecrease = build;
        build.getClass();
        return build;
    }
}
