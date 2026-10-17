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
import defpackage.gy;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AutoGraphKt {
    private static ImageVector _autoGraph;

    public static final ImageVector getAutoGraph(Icons.Outlined outlined) {
        ImageVector imageVector = _autoGraph;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AutoGraph", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(14.06f, 9.94f, 12.0f, 9.0f);
        i.lineToRelative(2.06f, -0.94f);
        i.lineTo(15.0f, 6.0f);
        i.lineToRelative(0.94f, 2.06f);
        i.lineTo(18.0f, 9.0f);
        i.lineToRelative(-2.06f, 0.94f);
        r6.C(i, 15.0f, 12.0f, 14.06f, 9.94f);
        i.moveTo(4.0f, 14.0f);
        i.lineToRelative(0.94f, -2.06f);
        i.lineTo(7.0f, 11.0f);
        i.lineToRelative(-2.06f, -0.94f);
        i.lineTo(4.0f, 8.0f);
        i.lineToRelative(-0.94f, 2.06f);
        i.lineTo(1.0f, 11.0f);
        gy.B(i, 2.06f, 0.94f, 4.0f, 14.0f);
        i.moveTo(8.5f, 9.0f);
        i.lineToRelative(1.09f, -2.41f);
        i.lineTo(12.0f, 5.5f);
        i.lineTo(9.59f, 4.41f);
        i.lineTo(8.5f, 2.0f);
        i.lineTo(7.41f, 4.41f);
        i.lineTo(5.0f, 5.5f);
        gy.B(i, 2.41f, 1.09f, 8.5f, 9.0f);
        i.moveTo(4.5f, 20.5f);
        i.lineToRelative(6.0f, -6.01f);
        i.lineToRelative(4.0f, 4.0f);
        i.lineTo(23.0f, 8.93f);
        i.lineToRelative(-1.41f, -1.41f);
        i.lineToRelative(-7.09f, 7.97f);
        i.lineToRelative(-4.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i, 3.0f, 19.0f, 4.5f, 20.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoGraph = build;
        build.getClass();
        return build;
    }
}
