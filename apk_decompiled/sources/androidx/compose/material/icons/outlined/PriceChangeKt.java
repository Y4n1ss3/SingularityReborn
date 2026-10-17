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
import defpackage.af0;
import defpackage.c21;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PriceChangeKt {
    private static ImageVector _priceChange;

    public static final ImageVector getPriceChange(Icons.Outlined outlined) {
        ImageVector imageVector = _priceChange;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PriceChange", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(8.0f, 17.0f, 2.0f, -1.0f, 1.0f);
        n.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        n.verticalLineToRelative(-3.0f);
        n.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        af0.g(n, 8.0f, -1.0f, 4.0f, 8.0f);
        af0.p(n, -2.0f, 7.0f, 8.0f, 1.0f);
        n.horizontalLineTo(7.0f);
        n.curveTo(6.45f, 8.0f, 6.0f, 8.45f, 6.0f, 9.0f);
        n.verticalLineToRelative(3.0f);
        n.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        af0.z(n, 3.0f, 1.0f, 6.0f, 2.0f);
        uo.r(n, 2.0f, 17.0f, 20.0f, 4.0f);
        n.horizontalLineTo(4.0f);
        n.curveTo(2.89f, 4.0f, 2.01f, 4.89f, 2.01f, 6.0f);
        n.lineTo(2.0f, 18.0f);
        n.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        n.horizontalLineToRelative(16.0f);
        n.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        n.verticalLineTo(6.0f);
        n.curveTo(22.0f, 4.89f, 21.11f, 4.0f, 20.0f, 4.0f);
        c21.d(n, 20.0f, 18.0f, 4.0f, 6.0f);
        uo.r(n, 16.0f, 18.0f, 14.0f, 10.0f);
        n.lineToRelative(2.0f, -2.0f);
        n.lineToRelative(2.0f, 2.0f);
        n.moveTo(18.0f, 14.25f);
        n.lineToRelative(-2.0f, 2.0f);
        n.lineToRelative(-2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, n.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _priceChange = build;
        build.getClass();
        return build;
    }
}
