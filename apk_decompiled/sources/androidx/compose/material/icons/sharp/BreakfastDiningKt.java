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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BreakfastDiningKt {
    private static ImageVector _breakfastDining;

    public static final ImageVector getBreakfastDining(Icons.Sharp sharp) {
        ImageVector imageVector = _breakfastDining;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.BreakfastDining", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.85f, 3.0f, 6.14f, 3.0f);
        i.curveTo(4.15f, 3.0f, 2.36f, 4.39f, 2.05f, 6.36f);
        i.curveTo(1.78f, 8.11f, 2.64f, 9.65f, 4.0f, 10.45f);
        uf.z(i, 21.0f, 16.0f, 10.45f);
        i.curveToRelative(1.36f, -0.79f, 2.23f, -2.36f, 1.95f, -4.11f);
        i.curveTo(21.63f, 4.38f, 19.83f, 3.0f, 17.85f, 3.0f);
        k4.r(i, 16.41f, 13.0f, 12.0f, 17.42f);
        i.lineTo(7.59f, 13.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i, 12.0f, 8.59f, 16.41f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _breakfastDining = build;
        build.getClass();
        return build;
    }
}
