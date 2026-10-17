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
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RamenDiningKt {
    private static ImageVector _ramenDining;

    public static final ImageVector getRamenDining(Icons.Filled filled) {
        ImageVector imageVector = _ramenDining;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RamenDining", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = gy.c(9.0f, 6.0f, 8.0f, 4.65f);
        uf.x(c, 1.0f, -0.12f, 6.0f);
        uo.p(c, 9.0f, 12.0f, 8.0f, 7.0f);
        uo.r(c, 1.0f, 12.0f, 6.0f, 7.0f);
        gy.t(c, 1.0f, 5.0f, 6.0f, 7.0f);
        c.moveTo(6.0f, 4.88f);
        uo.x(c, 1.0f, -0.12f, 6.0f, 6.0f);
        uo.y(c, 4.88f, 22.0f, 3.0f, 2.0f);
        kf0.u(c, 5.0f, 4.0f, 8.0f, 2.0f);
        c.curveToRelative(0.0f, 3.69f, 2.47f, 6.86f, 6.0f, 8.25f);
        kf0.r(c, 22.0f, 8.0f, -1.75f);
        c.curveToRelative(3.53f, -1.39f, 6.0f, -4.56f, 6.0f, -8.25f);
        c.horizontalLineTo(10.0f);
        c.verticalLineTo(7.0f);
        c.horizontalLineToRelative(12.0f);
        c.verticalLineTo(6.0f);
        c.horizontalLineTo(10.0f);
        c.verticalLineTo(4.41f);
        c.lineTo(22.0f, 3.0f);
        c.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ramenDining = build;
        build.getClass();
        return build;
    }
}
