package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.fc;
import defpackage.gy;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwapVertKt {
    private static ImageVector _swapVert;

    public static final ImageVector getSwapVert(Icons.Outlined outlined) {
        ImageVector imageVector = _swapVert;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SwapVert", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(16.0f, 17.01f, 16.0f, 10.0f, -2.0f);
        uo.B(k, 7.01f, -3.0f, 15.0f, 21.0f);
        uf.r(k, 4.0f, -3.99f, -3.0f);
        k.moveTo(9.0f, 3.0f);
        k.lineTo(5.0f, 6.99f);
        uo.n(k, 3.0f, 8.0f, 14.0f, 2.0f);
        k.lineTo(10.0f, 6.99f);
        gy.n(k, 3.0f, 9.0f, 3.0f);
        k.moveTo(16.0f, 17.01f);
        fc.w(k, 16.0f, 10.0f, -2.0f, 7.01f);
        k.horizontalLineToRelative(-3.0f);
        k.lineTo(15.0f, 21.0f);
        uf.r(k, 4.0f, -3.99f, -3.0f);
        k.moveTo(9.0f, 3.0f);
        k.lineTo(5.0f, 6.99f);
        uo.n(k, 3.0f, 8.0f, 14.0f, 2.0f);
        k.lineTo(10.0f, 6.99f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.d(k, 3.0f, 9.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swapVert = build;
        build.getClass();
        return build;
    }
}
