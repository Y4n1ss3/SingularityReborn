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
import defpackage.er;
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ListAltKt {
    private static ImageVector _listAlt;

    public static final ImageVector getListAlt(Icons.Filled filled) {
        ImageVector imageVector = _listAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ListAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = gy.y(19.0f, 5.0f, 14.0f, 5.0f, 19.0f);
        y.lineTo(5.0f, 5.0f);
        y.horizontalLineToRelative(14.0f);
        y.moveToRelative(1.1f, -2.0f);
        y.lineTo(3.9f, 3.0f);
        y.curveToRelative(-0.5f, 0.0f, -0.9f, 0.4f, -0.9f, 0.9f);
        y.verticalLineToRelative(16.2f);
        y.curveToRelative(0.0f, 0.4f, 0.4f, 0.9f, 0.9f, 0.9f);
        y.horizontalLineToRelative(16.2f);
        y.curveToRelative(0.4f, 0.0f, 0.9f, -0.5f, 0.9f, -0.9f);
        y.lineTo(21.0f, 3.9f);
        y.curveToRelative(0.0f, -0.5f, -0.5f, -0.9f, -0.9f, -0.9f);
        r6.B(y, 11.0f, 7.0f, 6.0f, 2.0f);
        gy.n(y, -6.0f, 11.0f, 7.0f);
        k4.C(y, 11.0f, 11.0f, 6.0f, 2.0f);
        fc.x(y, -6.0f, -2.0f, 11.0f, 15.0f);
        j50.n(y, 6.0f, 2.0f, -6.0f);
        k4.C(y, 7.0f, 7.0f, 2.0f, 2.0f);
        uo.l(y, 7.0f, 9.0f, 7.0f, 11.0f);
        j50.o(y, 2.0f, 2.0f, 7.0f, 13.0f);
        k4.C(y, 7.0f, 15.0f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(y, 7.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _listAlt = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getListAlt$annotations(Icons.Filled filled) {
    }
}
