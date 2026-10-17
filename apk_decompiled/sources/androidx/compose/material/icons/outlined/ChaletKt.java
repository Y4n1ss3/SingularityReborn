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
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChaletKt {
    private static ImageVector _chalet;

    public static final ImageVector getChalet(Icons.Outlined outlined) {
        ImageVector imageVector = _chalet;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Chalet", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.5f, 15.0f, 10.0f, 7.5f);
        i.lineTo(2.5f, 15.0f);
        i.lineToRelative(1.41f, 1.41f);
        fc.t(i, 5.0f, 15.33f, 20.0f, 10.0f);
        i.verticalLineToRelative(-4.67f);
        gy.B(i, 1.09f, 1.09f, 17.5f, 15.0f);
        k4.C(i, 13.0f, 18.0f, -2.0f, -3.0f);
        af0.o(i, 9.0f, 3.0f, 7.0f, -4.67f);
        i.lineToRelative(3.0f, -3.0f);
        uf.x(i, 3.0f, 3.0f, 18.0f);
        i.moveTo(22.0f, 7.5f);
        i.horizontalLineToRelative(-1.19f);
        i.lineToRelative(0.75f, 0.75f);
        i.lineToRelative(-0.71f, 0.71f);
        r6.w(i, 19.39f, 7.5f, 18.5f, 0.89f);
        i.lineToRelative(1.45f, 1.45f);
        i.lineToRelative(-0.71f, 0.71f);
        fc.t(i, 18.5f, 9.81f, 11.0f, -1.0f);
        i.verticalLineTo(9.81f);
        i.lineToRelative(-0.75f, 0.75f);
        i.lineToRelative(-0.71f, -0.71f);
        fc.u(i, 1.45f, -1.45f, 7.5f, -0.89f);
        i.lineToRelative(-1.45f, 1.45f);
        i.lineToRelative(-0.71f, -0.71f);
        j50.x(i, 0.75f, -0.75f, 14.0f, -1.0f);
        i.horizontalLineToRelative(1.19f);
        i.lineToRelative(-0.75f, -0.75f);
        i.lineToRelative(0.71f, -0.71f);
        fc.r(i, 1.45f, 1.45f, 0.89f, 5.61f);
        i.lineToRelative(-1.45f, -1.45f);
        i.lineToRelative(0.71f, -0.71f);
        fc.u(i, 0.75f, 0.75f, 3.0f, 1.0f);
        i.verticalLineToRelative(1.19f);
        i.lineToRelative(0.75f, -0.75f);
        i.lineToRelative(0.71f, 0.71f);
        fc.t(i, 18.5f, 5.61f, 6.5f, 0.89f);
        i.lineToRelative(1.45f, -1.45f);
        i.lineToRelative(0.71f, 0.71f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.g(i, 20.81f, 6.5f, 22.0f, 7.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _chalet = build;
        build.getClass();
        return build;
    }
}
