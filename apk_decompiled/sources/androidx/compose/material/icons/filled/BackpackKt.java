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
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BackpackKt {
    private static ImageVector _backpack;

    public static final ImageVector getBackpack(Icons.Filled filled) {
        ImageVector imageVector = _backpack;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Backpack", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(20.0f, 8.0f, 12.0f);
        h.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        h.horizontalLineTo(6.0f);
        h.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        h.verticalLineTo(8.0f);
        h.curveToRelative(0.0f, -1.86f, 1.28f, -3.41f, 3.0f, -3.86f);
        uf.p(h, 2.0f, 3.0f, 2.0f, 4.0f);
        kf0.r(h, 2.0f, 3.0f, 2.14f);
        h.curveTo(18.72f, 4.59f, 20.0f, 6.14f, 20.0f, 8.0f);
        uo.C(h, 6.0f, 12.0f, 2.0f, 10.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.i(h, 2.0f, 2.0f, -4.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _backpack = build;
        build.getClass();
        return build;
    }
}
