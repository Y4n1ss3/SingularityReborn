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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GridOffKt {
    private static ImageVector _gridOff;

    public static final ImageVector getGridOff(Icons.Outlined outlined) {
        ImageVector imageVector = _gridOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.GridOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(8.0f, 4.0f, 0.89f, 2.0f, 2.0f);
        fc.w(n, 10.0f, 4.0f, 4.0f, 4.0f);
        n.horizontalLineToRelative(-2.89f);
        n.lineToRelative(2.0f, 2.0f);
        n.lineTo(14.0f, 10.0f);
        n.verticalLineToRelative(0.89f);
        n.lineToRelative(2.0f, 2.0f);
        fc.w(n, 16.0f, 10.0f, 4.0f, 4.0f);
        n.horizontalLineToRelative(-2.89f);
        n.lineToRelative(2.0f, 2.0f);
        n.lineTo(20.0f, 16.0f);
        n.verticalLineToRelative(0.89f);
        n.lineToRelative(2.0f, 2.0f);
        n.lineTo(22.0f, 4.0f);
        n.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        n.lineTo(5.11f, 2.0f);
        gy.B(n, 2.0f, 2.0f, 8.0f, 4.0f);
        k4.C(n, 16.0f, 4.0f, 4.0f, 4.0f);
        gy.n(n, -4.0f, 16.0f, 4.0f);
        n.moveTo(1.41f, 1.14f);
        n.lineTo(0.0f, 2.55f);
        n.lineToRelative(2.0f, 2.0f);
        n.lineTo(2.0f, 20.0f);
        n.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        n.horizontalLineToRelative(15.45f);
        n.lineToRelative(2.01f, 2.01f);
        gy.B(n, 1.41f, -1.41f, 1.41f, 1.14f);
        n.moveTo(10.0f, 12.55f);
        n.lineTo(11.45f, 14.0f);
        bv.r(n, 10.0f, 14.0f, -1.45f);
        n.moveTo(4.0f, 6.55f);
        n.lineTo(5.45f, 8.0f);
        r6.C(n, 4.0f, 8.0f, 4.0f, 6.55f);
        n.moveTo(8.0f, 20.0f);
        af0.m(n, 4.0f, 20.0f, -4.0f, 4.0f);
        r6.l(n, 4.0f, 8.0f, 14.0f);
        af0.m(n, 4.0f, 14.0f, -4.0f, 3.45f);
        gy.B(n, 0.55f, 0.55f, 8.0f, 14.0f);
        k4.C(n, 14.0f, 20.0f, -4.0f, -4.0f);
        n.horizontalLineToRelative(3.45f);
        gy.B(n, 0.55f, 0.55f, 14.0f, 20.0f);
        n.moveTo(16.0f, 20.0f);
        n.verticalLineToRelative(-1.45f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(n, 17.45f, 20.0f, 16.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gridOff = build;
        build.getClass();
        return build;
    }
}
