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
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DynamicFormKt {
    private static ImageVector _dynamicForm;

    public static final ImageVector getDynamicForm(Icons.Sharp sharp) {
        ImageVector imageVector = _dynamicForm;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DynamicForm", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(17.0f, 20.0f, -9.0f, -2.0f, 4.0f);
        kf0.B(w, 7.0f, -2.0f, 5.0f, 2.0f);
        uo.l(w, 17.0f, 20.0f, 15.0f, 13.0f);
        w.verticalLineToRelative(7.0f);
        w.horizontalLineTo(2.0f);
        w.verticalLineToRelative(-7.0f);
        w.horizontalLineTo(15.0f);
        w.close();
        k4.C(w, 6.25f, 15.75f, -1.5f, 1.5f);
        uo.r(w, 1.5f, 15.75f, 13.0f, 4.0f);
        w.verticalLineToRelative(7.0f);
        w.horizontalLineTo(2.0f);
        w.verticalLineTo(4.0f);
        w.horizontalLineTo(13.0f);
        w.close();
        k4.C(w, 6.25f, 6.75f, -1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(w, 1.5f, 6.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dynamicForm = build;
        build.getClass();
        return build;
    }
}
