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
import defpackage.er;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ArrowBackIosKt {
    private static ImageVector _arrowBackIos;

    public static final ImageVector getArrowBackIos(Icons.Sharp sharp) {
        ImageVector imageVector = _arrowBackIos;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ArrowBackIos", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.51f, 3.87f, 15.73f, 2.1f);
        i.lineTo(5.84f, 12.0f);
        i.lineToRelative(9.9f, 9.9f);
        i.lineToRelative(1.77f, -1.77f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(i, 9.38f, 12.0f, 8.13f, -8.13f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _arrowBackIos = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getArrowBackIos$annotations(Icons.Sharp sharp) {
    }
}
