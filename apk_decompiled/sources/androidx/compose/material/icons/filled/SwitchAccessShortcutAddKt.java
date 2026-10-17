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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwitchAccessShortcutAddKt {
    private static ImageVector _switchAccessShortcutAdd;

    public static final ImageVector getSwitchAccessShortcutAdd(Icons.Filled filled) {
        ImageVector imageVector = _switchAccessShortcutAdd;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SwitchAccessShortcutAdd", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(24.0f, 14.0f, -2.0f, -2.0f, -2.0f);
        r6.D(n, 2.0f, -2.0f, 2.0f, 2.0f);
        r6.D(n, 2.0f, 2.0f, -2.0f, 2.0f);
        bv.t(n, 14.0f, 7.06f, 8.94f);
        n.lineTo(5.0f, 8.0f);
        n.lineToRelative(2.06f, -0.94f);
        n.lineTo(8.0f, 5.0f);
        n.lineToRelative(0.94f, 2.06f);
        n.lineTo(11.0f, 8.0f);
        n.lineTo(8.94f, 8.94f);
        r6.C(n, 8.0f, 11.0f, 7.06f, 8.94f);
        n.moveTo(8.0f, 21.0f);
        n.lineToRelative(0.94f, -2.06f);
        n.lineTo(11.0f, 18.0f);
        n.lineToRelative(-2.06f, -0.94f);
        n.lineTo(8.0f, 15.0f);
        n.lineToRelative(-0.94f, 2.06f);
        n.lineTo(5.0f, 18.0f);
        gy.B(n, 2.06f, 0.94f, 8.0f, 21.0f);
        n.moveTo(4.37f, 12.37f);
        n.lineTo(3.0f, 13.0f);
        n.lineToRelative(1.37f, 0.63f);
        n.lineTo(5.0f, 15.0f);
        n.lineToRelative(0.63f, -1.37f);
        n.lineTo(7.0f, 13.0f);
        n.lineToRelative(-1.37f, -0.63f);
        r6.C(n, 5.0f, 11.0f, 4.37f, 12.37f);
        n.moveTo(12.0f, 12.0f);
        n.curveToRelative(0.0f, -2.73f, 1.08f, -5.27f, 2.75f, -7.25f);
        fc.w(n, 12.0f, 2.0f, 7.0f, 7.0f);
        n.lineToRelative(-2.82f, -2.82f);
        n.curveTo(14.84f, 7.82f, 14.0f, 9.88f, 14.0f, 12.0f);
        n.curveToRelative(0.0f, 3.32f, 2.1f, 6.36f, 5.0f, 7.82f);
        n.lineTo(19.0f, 22.0f);
        n.curveTo(14.91f, 20.41f, 12.0f, 16.35f, 12.0f, 12.0f);
        n.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, n.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _switchAccessShortcutAdd = build;
        build.getClass();
        return build;
    }
}
