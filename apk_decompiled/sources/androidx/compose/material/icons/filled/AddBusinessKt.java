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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddBusinessKt {
    private static ImageVector _addBusiness;

    public static final ImageVector getAddBusiness(Icons.Filled filled) {
        ImageVector imageVector = _addBusiness;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AddBusiness", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(15.0f, 17.0f, 2.0f, -3.0f, 1.0f);
        n.verticalLineToRelative(-2.0f);
        n.lineToRelative(-1.0f, -5.0f);
        n.horizontalLineTo(2.0f);
        r6.A(n, -1.0f, 5.0f, 2.0f, 1.0f);
        r6.D(n, 6.0f, 9.0f, -6.0f, 4.0f);
        k4.B(n, 17.0f, 9.0f, 18.0f, 4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.f(n, -4.0f, 5.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(2.0f, 4.0f, 15.0f, 2.0f, -15.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.0f, 18.0f, 0.0f, -3.0f);
        e.lineToRelative(-2.0f, 0.0f);
        e.lineToRelative(0.0f, 3.0f);
        e.lineToRelative(-3.0f, 0.0f);
        e.lineToRelative(0.0f, 2.0f);
        e.lineToRelative(3.0f, 0.0f);
        e.lineToRelative(0.0f, 3.0f);
        e.lineToRelative(2.0f, 0.0f);
        e.lineToRelative(0.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 3.0f, 0.0f, 0.0f, -2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addBusiness = build;
        build.getClass();
        return build;
    }
}
