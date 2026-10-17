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
import defpackage.bv;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TaskKt {
    private static ImageVector _task;

    public static final ImageVector getTask(Icons.TwoTone twoTone) {
        ImageVector imageVector = _task;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Task", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder f = j50.f(13.0f, 9.0f, 4.0f, 6.0f, 16.0f);
        kf0.v(f, 12.0f, 9.0f, 13.0f);
        f.moveTo(10.94f, 18.0f);
        f.lineTo(7.4f, 14.46f);
        f.lineToRelative(1.41f, -1.41f);
        f.lineToRelative(2.12f, 2.12f);
        f.lineToRelative(4.24f, -4.24f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(f, 1.41f, 1.41f, 10.94f, 18.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(14.0f, 2.0f, 6.0f);
        d.curveTo(4.9f, 2.0f, 4.01f, 2.9f, 4.01f, 4.0f);
        d.lineTo(4.0f, 20.0f);
        d.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        d.horizontalLineTo(18.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        bv.k(d, 8.0f, 14.0f, 2.0f);
        uo.p(d, 18.0f, 20.0f, 6.0f, 4.0f);
        bv.l(d, 7.0f, 5.0f, 5.0f, 20.0f);
        d.moveTo(8.82f, 13.05f);
        d.lineTo(7.4f, 14.46f);
        d.lineTo(10.94f, 18.0f);
        d.lineToRelative(5.66f, -5.66f);
        d.lineToRelative(-1.41f, -1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(d, -4.24f, 4.24f, 8.82f, 13.05f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _task = build;
        build.getClass();
        return build;
    }
}
