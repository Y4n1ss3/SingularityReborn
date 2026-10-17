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
import defpackage.j50;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WorkOffKt {
    private static ImageVector _workOff;

    public static final ImageVector getWorkOff(Icons.Rounded rounded) {
        ImageVector imageVector = _workOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WorkOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(4.11f, 2.54f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineTo(4.74f, 6.0f);
        b.horizontalLineTo(4.0f);
        b.curveToRelative(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
        b.lineTo(2.0f, 19.0f);
        b.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(15.74f);
        b.lineToRelative(1.29f, 1.29f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        uo.l(b, 4.11f, 2.54f, 10.0f, 4.0f);
        kf0.x(b, 4.0f, 2.0f, -3.6f);
        b.lineTo(22.0f, 17.6f);
        b.verticalLineTo(8.0f);
        b.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        b.horizontalLineToRelative(-4.0f);
        b.verticalLineTo(4.0f);
        b.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        b.horizontalLineToRelative(-4.0f);
        b.curveToRelative(-0.99f, 0.0f, -1.8f, 0.7f, -1.96f, 1.64f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.l(b, 10.0f, 5.6f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _workOff = build;
        build.getClass();
        return build;
    }
}
