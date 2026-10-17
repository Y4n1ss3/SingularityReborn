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
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WorkOffKt {
    private static ImageVector _workOff;

    public static final ImageVector getWorkOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _workOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.WorkOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(4.0f, 8.0f, 11.0f, 13.74f);
        fc.B(m, -11.0f, -11.0f, 12.4f, 8.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(m, 7.6f, 7.6f, 20.0f, 8.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(10.0f, 4.0f, 4.0f, 2.0f, -3.6f);
        j50.x(n, 2.0f, 2.0f, 20.0f, 7.6f);
        n.lineToRelative(2.0f, 2.0f);
        n.verticalLineTo(8.0f);
        n.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        n.horizontalLineToRelative(-4.0f);
        n.verticalLineTo(4.0f);
        n.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        n.horizontalLineToRelative(-4.0f);
        n.curveToRelative(-0.99f, 0.0f, -1.8f, 0.7f, -1.96f, 1.64f);
        uf.o(n, 10.0f, 5.6f, 4.0f);
        n.moveTo(3.4f, 1.84f);
        n.lineTo(1.99f, 3.25f);
        n.lineTo(4.74f, 6.0f);
        n.horizontalLineTo(4.0f);
        n.curveToRelative(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
        n.lineTo(2.0f, 19.0f);
        n.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        n.horizontalLineToRelative(15.74f);
        n.lineToRelative(2.0f, 2.0f);
        gy.B(n, 1.41f, -1.41f, 3.4f, 1.84f);
        kp0.t(n, 4.0f, 19.0f, 8.0f, 2.74f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.d(n, 11.0f, 11.0f, 4.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _workOff = build;
        build.getClass();
        return build;
    }
}
