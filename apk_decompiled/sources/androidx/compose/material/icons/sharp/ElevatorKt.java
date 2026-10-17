package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.gy;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ElevatorKt {
    private static ImageVector _elevator;

    public static final ImageVector getElevator(Icons.Sharp sharp) {
        ImageVector imageVector = _elevator;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Elevator", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(21.0f, 3.0f, 3.0f, 18.0f, 18.0f);
        bv.t(i, 3.0f, 8.5f, 6.0f);
        i.curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f);
        i.curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f);
        i.reflectiveCurveTo(7.25f, 7.94f, 7.25f, 7.25f);
        i.curveTo(7.25f, 6.56f, 7.81f, 6.0f, 8.5f, 6.0f);
        r6.B(i, 11.0f, 14.0f, -1.0f, 4.0f);
        uf.B(i, 7.0f, -4.0f, 6.0f, 9.5f);
        uo.r(i, 5.0f, 14.0f, 15.5f, 17.0f);
        i.lineTo(13.0f, 13.0f);
        gy.n(i, 5.0f, 15.5f, 17.0f);
        i.moveTo(13.0f, 11.0f);
        i.lineToRelative(2.5f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.d(i, 2.5f, 4.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _elevator = build;
        build.getClass();
        return build;
    }
}
