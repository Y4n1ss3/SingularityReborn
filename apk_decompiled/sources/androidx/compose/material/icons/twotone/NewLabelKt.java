package androidx.compose.material.icons.twotone;

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
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NewLabelKt {
    private static ImageVector _newLabel;

    public static final ImageVector getNewLabel(Icons.TwoTone twoTone) {
        ImageVector imageVector = _newLabel;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NewLabel", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.0f, 17.0f, 0.0f, -4.0f);
        e.lineToRelative(-3.0f, 0.0f);
        e.lineToRelative(0.0f, -3.0f);
        e.lineToRelative(-4.0f, 0.0f);
        e.lineToRelative(0.0f, -3.0f);
        e.lineToRelative(10.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 3.55f, 5.0f, -3.55f, 5.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(21.0f, 12.0f, -4.37f, 6.16f);
        e2.curveTo(16.26f, 18.68f, 15.65f, 19.0f, 15.0f, 19.0f);
        kf0.B(e2, -3.0f, 0.0f, -2.0f, 3.0f);
        e2.lineToRelative(3.55f, -5.0f);
        r6.w(e2, 15.0f, 7.0f, 5.0f, 3.0f);
        e2.horizontalLineTo(3.0f);
        e2.verticalLineTo(7.0f);
        e2.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        e2.horizontalLineToRelative(10.0f);
        e2.curveToRelative(0.65f, 0.0f, 1.26f, 0.31f, 1.63f, 0.84f);
        uo.l(e2, 21.0f, 12.0f, 10.0f, 15.0f);
        af0.o(e2, 7.0f, -3.0f, 5.0f, 3.0f);
        uf.k(e2, 2.0f, 2.0f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(e2, 2.0f, -3.0f, 3.0f, 15.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _newLabel = build;
        build.getClass();
        return build;
    }
}
