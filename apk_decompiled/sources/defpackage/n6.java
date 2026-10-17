package defpackage;

import android.graphics.Shader;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.platform.AndroidTextPaint;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class n6 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n6(int i, long j, Object obj) {
        this.d = i;
        this.f = obj;
        this.e = j;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        Shader brush_12SF9DM$lambda$0;
        w01 Month$lambda$58$lambda$57$lambda$54$lambda$53;
        TextFieldState rememberTextFieldState_Le_punE$lambda$0$0;
        int i = this.d;
        long j = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                brush_12SF9DM$lambda$0 = AndroidTextPaint.setBrush_12SF9DM$lambda$0((Brush) obj, j);
                return brush_12SF9DM$lambda$0;
            case 1:
                Month$lambda$58$lambda$57$lambda$54$lambda$53 = DatePickerKt.Month$lambda$58$lambda$57$lambda$54$lambda$53((ky) obj, j);
                return Month$lambda$58$lambda$57$lambda$54$lambda$53;
            default:
                rememberTextFieldState_Le_punE$lambda$0$0 = TextFieldStateKt.rememberTextFieldState_Le_punE$lambda$0$0((String) obj, j);
                return rememberTextFieldState_Le_punE$lambda$0$0;
        }
    }
}
