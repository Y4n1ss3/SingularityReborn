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
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChaletKt {
    private static ImageVector _chalet;

    public static final ImageVector getChalet(Icons.Filled filled) {
        ImageVector imageVector = _chalet;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Chalet", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(10.0f, 7.5f, 7.5f, 7.5f);
        e.lineToRelative(-1.41f, 1.41f);
        fc.t(e, 15.0f, 15.33f, 20.0f, -4.0f);
        af0.s(e, -5.0f, 9.0f, 5.0f, 5.0f);
        e.verticalLineToRelative(-4.67f);
        e.lineToRelative(-1.09f, 1.09f);
        r6.C(e, 2.5f, 15.0f, 10.0f, 7.5f);
        e.moveTo(22.0f, 6.5f);
        e.horizontalLineToRelative(-1.19f);
        e.lineToRelative(0.75f, -0.75f);
        e.lineToRelative(-0.71f, -0.71f);
        fc.v(e, 19.39f, 6.5f, 18.5f, 5.61f);
        e.lineToRelative(1.45f, -1.45f);
        e.lineToRelative(-0.71f, -0.71f);
        fc.t(e, 18.5f, 4.19f, 3.0f, -1.0f);
        e.verticalLineToRelative(1.19f);
        e.lineToRelative(-0.75f, -0.75f);
        e.lineToRelative(-0.71f, 0.71f);
        fc.u(e, 1.45f, 1.45f, 6.5f, -0.89f);
        e.lineToRelative(-1.45f, -1.45f);
        e.lineToRelative(-0.71f, 0.71f);
        j50.x(e, 0.75f, 0.75f, 14.0f, 1.0f);
        e.horizontalLineToRelative(1.19f);
        e.lineToRelative(-0.75f, 0.75f);
        e.lineToRelative(0.71f, 0.71f);
        r6.q(e, 1.45f, -1.45f, 0.89f, 0.89f);
        e.lineToRelative(-1.45f, 1.45f);
        e.lineToRelative(0.71f, 0.71f);
        fc.u(e, 0.75f, -0.75f, 11.0f, 1.0f);
        e.verticalLineTo(9.81f);
        e.lineToRelative(0.75f, 0.75f);
        e.lineToRelative(0.71f, -0.71f);
        fc.t(e, 18.5f, 8.39f, 7.5f, 0.89f);
        e.lineToRelative(1.45f, 1.45f);
        e.lineToRelative(0.71f, -0.71f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.g(e, 20.81f, 7.5f, 22.0f, 6.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _chalet = build;
        build.getClass();
        return build;
    }
}
