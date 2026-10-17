package androidx.compose.material.icons.rounded;

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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RamenDiningKt {
    private static ImageVector _ramenDining;

    public static final ImageVector getRamenDining(Icons.Rounded rounded) {
        ImageVector imageVector = _ramenDining;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RamenDining", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(22.0f, 2.84f, 22.0f, 2.84f);
        i.curveToRelative(0.0f, -0.45f, -0.39f, -0.79f, -0.83f, -0.75f);
        i.lineTo(4.89f, 3.9f);
        i.curveTo(4.38f, 3.95f, 4.0f, 4.38f, 4.0f, 4.89f);
        i.verticalLineTo(12.0f);
        i.horizontalLineTo(3.08f);
        i.curveToRelative(-0.6f, 0.0f, -1.08f, 0.53f, -1.0f, 1.13f);
        i.curveTo(2.52f, 16.33f, 4.83f, 19.0f, 8.0f, 20.25f);
        i.verticalLineTo(21.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(6.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        i.verticalLineToRelative(-0.75f);
        i.curveToRelative(3.17f, -1.25f, 5.48f, -3.92f, 5.92f, -7.12f);
        i.curveToRelative(0.08f, -0.6f, -0.4f, -1.13f, -1.0f, -1.13f);
        uf.t(i, 10.5f, 8.0f, 10.75f);
        i.curveTo(21.66f, 8.0f, 22.0f, 7.66f, 22.0f, 7.25f);
        i.verticalLineToRelative(0.0f);
        i.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        i.horizontalLineTo(10.5f);
        i.verticalLineTo(4.78f);
        i.lineToRelative(10.83f, -1.19f);
        i.curveTo(21.71f, 3.54f, 22.0f, 3.22f, 22.0f, 2.84f);
        fc.A(i, 6.5f, 5.22f, 6.5f, -1.0f);
        bv.k(i, 5.34f, 6.5f, 5.22f);
        k4.C(i, 5.5f, 8.0f, 1.0f, 4.0f);
        uo.r(i, -1.0f, 8.0f, 9.0f, 12.0f);
        uo.o(i, 8.0f, 8.0f, 1.0f, 12.0f);
        uo.p(i, 9.0f, 6.5f, 8.0f, 5.06f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.j(i, 1.0f, -0.11f, 6.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ramenDining = build;
        build.getClass();
        return build;
    }
}
