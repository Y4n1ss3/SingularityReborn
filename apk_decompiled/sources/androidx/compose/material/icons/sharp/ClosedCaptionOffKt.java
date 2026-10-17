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
import defpackage.c21;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClosedCaptionOffKt {
    private static ImageVector _closedCaptionOff;

    public static final ImageVector getClosedCaptionOff(Icons.Sharp sharp) {
        ImageVector imageVector = _closedCaptionOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ClosedCaptionOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(21.0f, 4.0f, 3.0f, 16.0f, 18.0f);
        k4.B(i, 4.0f, 11.0f, 11.0f, 9.5f);
        r6.D(i, -0.5f, -2.0f, 3.0f, 2.0f);
        i.verticalLineTo(13.0f);
        i.horizontalLineTo(11.0f);
        i.verticalLineToRelative(2.0f);
        i.horizontalLineTo(6.0f);
        c21.c(i, 9.0f, 5.0f, 11.0f);
        k4.C(i, 18.0f, 11.0f, -1.5f, -0.5f);
        af0.w(i, -2.0f, 3.0f, 2.0f, 13.0f);
        af0.g(i, 18.0f, 2.0f, -5.0f, 9.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(i, 5.0f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _closedCaptionOff = build;
        build.getClass();
        return build;
    }
}
