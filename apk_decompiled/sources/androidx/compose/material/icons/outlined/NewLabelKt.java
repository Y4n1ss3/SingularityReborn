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

    public static final ImageVector getNewLabel(Icons.Outlined outlined) {
        ImageVector imageVector = _newLabel;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NewLabel", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.0f, 12.0f, -4.37f, 6.16f);
        e.curveTo(16.26f, 18.68f, 15.65f, 19.0f, 15.0f, 19.0f);
        kf0.B(e, -3.0f, 0.0f, -2.0f, 3.0f);
        e.lineToRelative(3.55f, -5.0f);
        r6.w(e, 15.0f, 7.0f, 5.0f, 3.0f);
        e.horizontalLineTo(3.0f);
        e.verticalLineTo(7.0f);
        e.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        e.horizontalLineToRelative(10.0f);
        e.curveToRelative(0.65f, 0.0f, 1.26f, 0.31f, 1.63f, 0.84f);
        uo.l(e, 21.0f, 12.0f, 10.0f, 15.0f);
        af0.o(e, 7.0f, -3.0f, 5.0f, 3.0f);
        uf.k(e, 2.0f, 2.0f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(e, 2.0f, -3.0f, 3.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _newLabel = build;
        build.getClass();
        return build;
    }
}
