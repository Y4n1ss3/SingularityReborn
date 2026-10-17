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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FitnessCenterKt {
    private static ImageVector _fitnessCenter;

    public static final ImageVector getFitnessCenter(Icons.Filled filled) {
        ImageVector imageVector = _fitnessCenter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FitnessCenter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.57f, 14.86f, 22.0f, 13.43f);
        i.lineTo(20.57f, 12.0f);
        i.lineTo(17.0f, 15.57f);
        i.lineTo(8.43f, 7.0f);
        i.lineTo(12.0f, 3.43f);
        i.lineTo(10.57f, 2.0f);
        i.lineTo(9.14f, 3.43f);
        i.lineTo(7.71f, 2.0f);
        i.lineTo(5.57f, 4.14f);
        i.lineTo(4.14f, 2.71f);
        i.lineTo(2.71f, 4.14f);
        i.lineToRelative(1.43f, 1.43f);
        i.lineTo(2.0f, 7.71f);
        i.lineToRelative(1.43f, 1.43f);
        i.lineTo(2.0f, 10.57f);
        i.lineTo(3.43f, 12.0f);
        i.lineTo(7.0f, 8.43f);
        i.lineTo(15.57f, 17.0f);
        i.lineTo(12.0f, 20.57f);
        i.lineTo(13.43f, 22.0f);
        i.lineToRelative(1.43f, -1.43f);
        i.lineTo(16.29f, 22.0f);
        i.lineToRelative(2.14f, -2.14f);
        i.lineToRelative(1.43f, 1.43f);
        i.lineToRelative(1.43f, -1.43f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, -1.43f, -1.43f, 22.0f, 16.29f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fitnessCenter = build;
        build.getClass();
        return build;
    }
}
