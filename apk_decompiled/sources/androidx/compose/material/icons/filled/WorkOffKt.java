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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WorkOffKt {
    private static ImageVector _workOff;

    public static final ImageVector getWorkOff(Icons.Filled filled) {
        ImageVector imageVector = _workOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.WorkOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(23.0f, 21.74f, -1.46f, -1.46f);
        e.lineTo(7.21f, 5.95f);
        e.lineTo(3.25f, 1.99f);
        e.lineTo(1.99f, 3.25f);
        e.lineToRelative(2.7f, 2.7f);
        e.horizontalLineToRelative(-0.64f);
        e.curveToRelative(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
        e.lineToRelative(-0.01f, 11.0f);
        e.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(15.64f);
        r6.C(e, 21.74f, 23.0f, 23.0f, 21.74f);
        e.moveTo(22.0f, 7.95f);
        e.curveToRelative(0.05f, -1.11f, -0.84f, -2.0f, -1.95f, -1.95f);
        e.horizontalLineToRelative(-4.0f);
        e.verticalLineTo(3.95f);
        e.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -1.95f);
        e.horizontalLineToRelative(-4.0f);
        e.curveToRelative(-1.11f, -0.05f, -2.0f, 0.84f, -2.0f, 1.95f);
        uo.z(e, 0.32f, 13.95f, 14.0f, 7.95f);
        uo.p(e, 14.05f, 6.0f, 10.0f, 3.95f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(e, 4.05f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _workOff = build;
        build.getClass();
        return build;
    }
}
