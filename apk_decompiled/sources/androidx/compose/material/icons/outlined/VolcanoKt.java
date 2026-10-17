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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VolcanoKt {
    private static ImageVector _volcano;

    public static final ImageVector getVolcano(Icons.Outlined outlined) {
        ImageVector imageVector = _volcano;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Volcano", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(18.0f, 8.0f, -7.0f, -2.0f, 5.0f);
        uo.g(i, 6.0f, -4.0f, 9.0f, 20.0f);
        uo.l(i, 18.0f, 8.0f, 7.3f, 15.0f);
        i.horizontalLineTo(9.0f);
        i.horizontalLineToRelative(1.35f);
        i.lineToRelative(0.5f, -1.26f);
        i.lineToRelative(1.5f, -3.74f);
        r6.t(i, 4.14f, 2.86f, 10.0f, 5.08f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 7.3f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(13.0f, 1.0f, 2.0f, 4.0f, -2.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(k4.e(16.121f, 5.468f, 2.828f, -2.828f), 1.414f, 1.414f, -2.828f, 2.828f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(k4.e(7.64f, 4.05f, 1.414f, -1.414f), 2.828f, 2.828f, -1.414f, 1.414f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _volcano = build;
        build.getClass();
        return build;
    }
}
